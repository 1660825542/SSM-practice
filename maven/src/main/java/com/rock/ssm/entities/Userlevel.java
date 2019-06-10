package com.rock.ssm.entities;

public class Userlevel {
    private Integer levelid;

    private String levelname;

    private String leveltxt;

    public Integer getLevelid() {
        return levelid;
    }

    public Userlevel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Userlevel(Integer levelid, String levelname, String leveltxt) {
		super();
		this.levelid = levelid;
		this.levelname = levelname;
		this.leveltxt = leveltxt;
	}

	@Override
	public String toString() {
		return "Userlevel [levelid=" + levelid + ", levelname=" + levelname + ", leveltxt=" + leveltxt + "]";
	}

	public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public String getLeveltxt() {
        return leveltxt;
    }

    public void setLeveltxt(String leveltxt) {
        this.leveltxt = leveltxt == null ? null : leveltxt.trim();
    }
}