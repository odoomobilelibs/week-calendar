package com.odoo.calendar.listeners;

import com.odoo.calendar.utils.DateInfo;

public interface CalendarWeekDayHighlightListener {

    boolean canHighlightDate(DateInfo date);
}
