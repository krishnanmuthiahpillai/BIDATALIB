package com.bidata.mylibrary;

import org.joda.time.DateTime;

/**
 * Created by jhonn on 02/03/2017.
 */
public interface DatePickerListener {
    void onDateSelected(DateTime dateSelected);
}