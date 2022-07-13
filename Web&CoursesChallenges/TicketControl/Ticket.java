package Zadanie14_1;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime buyTime;
    private int duration;

    public Ticket(LocalDateTime buyTime, int duration) {
        this.buyTime = buyTime;
        this.duration = duration;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(LocalDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
