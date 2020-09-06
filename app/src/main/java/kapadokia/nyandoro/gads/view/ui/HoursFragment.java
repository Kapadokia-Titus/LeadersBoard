package kapadokia.nyandoro.gads.view.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import kapadokia.nyandoro.gads.databinding.FragmentHoursBinding;
import kapadokia.nyandoro.gads.service.model.Hours;
import kapadokia.nyandoro.gads.view.adapters.HoursAdapter;
import kapadokia.nyandoro.gads.viewmodel.HoursViewModel;

public class HoursFragment extends Fragment {
    static final String TAG = "HoursFragment";
    private FragmentHoursBinding binding;
    private HoursAdapter hoursAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHoursBinding.inflate(inflater, container, false);

        hoursAdapter =new HoursAdapter();
        binding.hoursRecycler.setAdapter(hoursAdapter);
        binding.setIsLoading(true);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final HoursViewModel hoursViewModel = ViewModelProviders.of(this).get(HoursViewModel.class);

        observeViewModel(hoursViewModel);

    }

    private void observeViewModel(HoursViewModel hoursViewModel) {
        // Update the list when the data changes
        hoursViewModel.getHoursListObservable().observe(this, new Observer<List<Hours>>() {
            @Override
            public void onChanged(List<Hours> hours) {
                binding.setIsLoading(false);
                hoursAdapter.setHoursList(hours);
            }
        });
    }


}