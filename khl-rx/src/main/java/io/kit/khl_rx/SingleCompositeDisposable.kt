package io.kit.khl_rx

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.internal.disposables.DisposableContainer

/**
 * A disposable container that can hold onto multiple other disposables
 * or be recreated every time a disposable is added
 *
 */
class SingleCompositeDisposable : Disposable, DisposableContainer {

    private var compositeDisposable: CompositeDisposable = CompositeDisposable()

    override fun isDisposed(): Boolean = compositeDisposable.isDisposed

    override fun dispose() = compositeDisposable.dispose()

    fun disposeWithInvalidation() {
        init(true)
    }

    override fun add(d: Disposable): Boolean = compositeDisposable.add(d)

    fun invalidateAndAdd(d: Disposable): Boolean {
        init(true)
        return compositeDisposable.add(d)
    }

    fun clearWithInvalidation() {
        compositeDisposable.clear()
        init(false)
    }

    private fun init(needToDispose : Boolean) {
        if (needToDispose) compositeDisposable.dispose()
        compositeDisposable = CompositeDisposable()
    }

    override fun remove(d: Disposable): Boolean = compositeDisposable.remove(d)

    override fun delete(d: Disposable): Boolean = compositeDisposable.delete(d)

    fun size() = compositeDisposable.size()
}