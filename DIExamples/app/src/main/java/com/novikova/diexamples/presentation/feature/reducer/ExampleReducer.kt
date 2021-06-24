package com.novikova.diexamples.presentation.feature.reducer

import com.novikova.diexamples.data.repository.IDataRepository
import com.novikova.diexamples.storage.LoggedUserProvider
import dagger.hilt.android.scopes.FragmentScoped
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@FragmentScoped
class ExampleReducer @Inject constructor(
    private val loggedUser: LoggedUserProvider,
    private val repository: IDataRepository
): IExampleReducer {
    override val updateText: PublishSubject<String> = PublishSubject.create()

    override fun setText() {
        val count = loggedUser.getCount() ?: 0
        updateText.onNext("Example Text $count")
        loggedUser.setCount(count + 1)

        repository.getData()
    }
}
