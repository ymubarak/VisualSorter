package sortController;

import java.io.File;

import sortModel.AudioPlayer;

public class PlayAudio {

	public void playAudio() {
		File file = new File(getClass().getResource("/sortModel/scoreSound.wav").getFile());
		String path = file.getAbsolutePath().replaceAll("%20", " ");
		AudioPlayer.main(null, path);
	}
}
