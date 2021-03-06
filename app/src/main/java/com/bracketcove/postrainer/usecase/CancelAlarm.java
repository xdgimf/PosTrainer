package com.bracketcove.postrainer.usecase;

import com.bracketcove.postrainer.data.alarm.AlarmService;
import com.bracketcove.postrainer.data.viewmodel.Reminder;

import io.reactivex.Completable;
import io.reactivex.Observable;

/**
 * Created by R_KAY on 5/23/2017.
 */

public class CancelAlarm implements AlarmUseCase {

    private final AlarmService alarmService;

    public CancelAlarm(AlarmService alarmService) {
        this.alarmService = alarmService;
    }

    @Override
    public Completable runUseCase(Reminder reminder) {
        return alarmService.cancelAlarm(reminder);
    }
}
