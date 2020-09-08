package kapadokia.nyandoro.gads.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;
import kapadokia.nyandoro.gads.service.repository.SubmitRepository;

public class SubmitProjectViewModel extends AndroidViewModel {

    public LiveData<Integer> submitProjectObservable;
    private String email;
    private String first_name;
    private String last_name;
    private String project_link;

    public SubmitProjectViewModel(@NonNull Application application) {
        super(application);

        submitProjectObservable = SubmitRepository.getInstance().submitProject(email, first_name, last_name,project_link);
    }

    public LiveData<Integer> setSubmitProjectObservable(String email, String first_name, String last_name, String project_link){

        this.email = email;
        this.first_name = first_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.project_link = project_link;

        return submitProjectObservable;}
}
