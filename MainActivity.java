package longdang.supercodevn.englishiseasy1;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    Button btnPlay, btnPause, btnStop;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoViewYouTube);
        btnPlay = (Button)findViewById(R.id.buttonPlay);
        btnPause = (Button)findViewById(R.id.buttonPause);
        btnStop = (Button)findViewById(R.id.buttonStop);
        
        Uri urlVideo = Uri.parse("http://mp3.zing.vn/video-clip/Beautiful-Van-Mai-Huong/ZW77EEDA.html"); //Link nay khong chay duoc
//        Uri uri = Uri.parse("http://khoapham.vn/download/amthambenem.mp4"); // Link nay chay duoc
        
        videoView.setMediaController(new MediaController(MainActivity.this));
        videoView.setVideoURI(urlVideo);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.start();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.stopPlayback();
            }
        });

    }
}
