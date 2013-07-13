package me.toddpickell.criminalintent;

import java.util.UUID;

/**
 * Created by toddpickell on 7/12/13.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
