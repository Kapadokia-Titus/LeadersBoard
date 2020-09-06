package kapadokia.nyandoro.gads.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import kapadokia.nyandoro.gads.service.model.Hours;
import kapadokia.nyandoro.gads.service.repository.GadsRepository;

public class HoursViewModel extends AndroidViewModel {

    private final LiveData<List<Hours>> hoursListObservable;
    public HoursViewModel(@NonNull Application application) {
        super(application);

        hoursListObservable = GadsRepository.getInstance().getHoursList();
    }

    public LiveData<List<Hours>> getHoursListObservable(){return hoursListObservable;}
}
