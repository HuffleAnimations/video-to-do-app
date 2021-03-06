package be.huffle.todoapp.model;

import javax.persistence.*;

@Entity
@Table(name = "video")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private int totalFrames;
	private int currentFrame;
	private String description;
	@Enumerated(EnumType.STRING)
	private VideoState videoState;
	private boolean hasScript;
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private LabelTag labelTag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTotalFrames() {
		return totalFrames;
	}

	public void setTotalFrames(int totalFrames) {
		this.totalFrames = totalFrames;
	}

	public int getCurrentFrame() {
		return currentFrame;
	}

	public void setCurrentFrame(int currentFrame) {
		this.currentFrame = currentFrame;
	}

	public VideoState getVideoState() {
		return videoState;
	}

	public void setVideoState(VideoState videoState) {
		this.videoState = videoState;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getScript() {
		return hasScript;
	}

	public void setScript(boolean hasScript) {
		this.hasScript = hasScript;
	}

	public LabelTag getLabelTag() {
		return labelTag;
	}

	public void setLabelTag(LabelTag labelTag) {
		this.labelTag = labelTag;
	}
}
