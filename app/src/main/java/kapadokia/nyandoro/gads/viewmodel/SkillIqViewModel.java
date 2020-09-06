package kapadokia.nyandoro.gads.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import kapadokia.nyandoro.gads.service.model.SkillIqs;
import kapadokia.nyandoro.gads.service.repository.GadsRepository;

public class SkillIqViewModel extends AndroidViewModel {

    private final LiveData<List<SkillIqs>> skillIqListObservable;
    public SkillIqViewModel(@NonNull Application application) {
        super(application);

        // FYI: If any transformation is needed, this can be simply done by Transformations class ...

        skillIqListObservable = GadsRepository.getInstance().getSkillIqList();
    }

    /**
     * Expose the LiveData Projects query so the UI can observe it.
     */

    public LiveData<List<SkillIqs>> getSkillIqListObservable(){return skillIqListObservable;}
}
