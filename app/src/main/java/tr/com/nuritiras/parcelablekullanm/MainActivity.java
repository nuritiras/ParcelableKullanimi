package tr.com.nuritiras.parcelablekullanm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import tr.com.nuritiras.parcelablekullanm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    public void onClickDataSend(View view) {
        String edFirstName = binding.editTextFirstName.getText().toString();
        String edLastName = binding.editTextLastNAme.getText().toString();
        int edAge =Integer.parseInt(binding.editTextAge.getText().toString());

        User user = new User(edFirstName,edLastName,edAge);

        Intent intent = new Intent(MainActivity.this,UserActivity.class);
        intent.putExtra("userKey",user);
        startActivity(intent);
    }
}