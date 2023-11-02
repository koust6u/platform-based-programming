package org.example.week6.NestedClass;

public abstract class Player {
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    // Builder 클래스를 정의하시오. (단, static nested class 로 정의하시오.  )
    static class Builder{
        private String name;
        private String playerType;
        private int jerseyNumber;
        private int speed;

        public Builder setPlayerType(String type){
            this.playerType = type;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setJerseyNumber(int number){
            this.jerseyNumber = number;
            return this;
        }

        public Builder setSpeed(int speed){
            this.speed = speed;
            return this;
        }

        public Player build(){
            Player player;
            if (playerType.equals("forward")){
                player = new Forward();
            }else if (playerType.equals("midfielder")){
                player = new MidFielder();
            }else{
                player = new Defender();
            }
            player.jerseyNumber = this.jerseyNumber;
            player.name = this.name;
            player.speed = this.speed;
            player.speed = player.getSpeed();
            return player;
        }
    }
    protected abstract int getSpeed() ;

    @Override
    public String toString() {
        return String.format("Player Name=%s, JerseyNumber=%d, SPEED=%d, ",
                name, jerseyNumber, speed);
    }
}
