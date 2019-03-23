package com.github.aamnony.smartdoorbell;

import android.os.Bundle;

import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetView;

import java.net.MalformedURLException;
import java.net.URL;

public class StreamActivity extends JitsiMeetActivity {

    public static final String EXTRA_USER_NAME = "user_name";
    private static final String STREAM_SERVER_URL = "https://www.smartdoorbell.ga/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String roomUrl = STREAM_SERVER_URL + getIntent().getStringExtra(EXTRA_USER_NAME) +
                "#config.startWithVideoMuted=true" + "&config.startWithAudioMuted=true";
        try {
            loadURL(new URL(roomUrl));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}