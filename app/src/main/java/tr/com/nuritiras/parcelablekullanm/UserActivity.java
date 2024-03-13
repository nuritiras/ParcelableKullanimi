package tr.com.nuritiras.parcelablekullanm;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import tr.com.nuritiras.parcelablekullanm.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {
    private ActivityUserBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("userKey",User.class);

        binding.textViewFirstName.setText(user.getFistName());
        binding.textViewLastName.setText(user.getLastName());
        binding.textViewAge.setText(String.valueOf(user.getAge()));
    }
}