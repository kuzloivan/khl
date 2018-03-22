package io.kit.khl_rx

import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


fun <T> Flowable<T>.sheduleIoToIo(): Flowable<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
}

fun <T> Flowable<T>.sheduleIoToUI(): Flowable<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Flowable<T>.sheduleUiToIO(): Flowable<T> {
    return this.subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io())
}

fun <T> Observable<T>.sheduleIoToIo(): Observable<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
}

fun <T> Observable<T>.sheduleIoToUI(): Observable<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Observable<T>.sheduleUiToIO(): Observable<T> {
    return this.subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io())
}

fun <T> Single<T>.sheduleIoToIo(): Single<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
}

fun <T> Single<T>.sheduleIoToUI(): Single<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Single<T>.sheduleUiToIO(): Single<T> {
    return this.subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io())
}

fun <T> Maybe<T>.sheduleIoToIo(): Maybe<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
}

fun <T> Maybe<T>.sheduleIoToUI(): Maybe<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Maybe<T>.sheduleUiToIO(): Maybe<T> {
    return this.subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io())
}

fun Completable.sheduleIoToIo(): Completable {
    return this.subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
}

fun Completable.sheduleIoToUI(): Completable {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun Completable.sheduleUiToIO(): Completable {
    return this.subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io())
}


