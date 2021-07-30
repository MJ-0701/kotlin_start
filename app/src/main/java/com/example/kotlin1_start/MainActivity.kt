package com.example.kotlin1_start

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin1_start.databinding.ActivityMainBinding
import com.kakao.sdk.user.UserApiClient

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)





//        var keyHash = Utility.getKeyHash(this)
//        Log.e("Hash",keyHash) // a9TzBklL6+ohAUob7DF/CtcB1D8

        UserApiClient.instance.me { user, error ->
            binding.id.text = "회원번호: ${user?.id}"
            binding.nickname.text = "닉네임: ${user?.kakaoAccount?.profile?.nickname}"
            binding.profileimageUrl.text = "프로필 링크: ${user?.kakaoAccount?.profile?.profileImageUrl}"
            binding.thumbnailimageUrl.text = "썸네일 링크: ${user?.kakaoAccount?.profile?.thumbnailImageUrl}"

        }

        // 로그아웃
        binding.kakaoLogoutButton.setOnClickListener {
            UserApiClient.instance.logout { error ->
                if (error != null) {
                    Log.e(TAG, "로그아웃 실패. SDK에서 토큰 삭제됨", error)
                }
                else {
                    Log.i(TAG, "로그아웃 성공. SDK에서 토큰 삭제됨")
                }
            }
        }

        // 연결 끊기
        binding.kakaoUnlinkButton.setOnClickListener {
            UserApiClient.instance.unlink { error ->
                if (error != null) {
                    Log.e(TAG, "연결 끊기 실패", error)
                }
                else {
                    Log.i(TAG, "연결 끊기 성공. SDK에서 토큰 삭제 됨")
                }
            }
        }

    }
}