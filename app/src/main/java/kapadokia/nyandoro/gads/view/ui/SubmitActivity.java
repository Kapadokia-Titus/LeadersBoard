package kapadokia.nyandoro.gads.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import kapadokia.nyandoro.gads.R;
import kapadokia.nyandoro.gads.databinding.ActivitySubmitBinding;
import kapadokia.nyandoro.gads.view.adapters.PagerAdapter;
import kapadokia.nyandoro.gads.viewmodel.SubmitProjectViewModel;

public class SubmitActivity extends AppCompatActivity {

    ActivitySubmitBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_submit);

        ToolBarSetup();
    }

    public void ToolBarSetup(){

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public void toSubmitAction(View view) {


        String email  = binding.emailAddress.getText().toString().trim();
        String first_name  = binding.firstName.getText().toString().trim();
        String last_name  = binding.lastName.getText().toString().trim();
        String projectLink  = binding.emailAddress.getText().toString().trim();


        final SubmitProjectViewModel submitProjectViewModel = ViewModelProviders.of(this).get(SubmitProjectViewModel.class);
        submitProjectViewModel.setSubmitProjectObservable(email,first_name,last_name,projectLink).observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {

                if (integer>=200 && integer<300){
                    Toast.makeText(SubmitActivity.this, "Data sent successfully",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(SubmitActivity.this, "Failed to send",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}