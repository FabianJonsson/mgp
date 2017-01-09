import GameEngine.TickListener
import GameEngine.TickInfo

class SoundEngine implements TickListener {

   SoundEngine(GameEngine game) {
      game.addTickListener(this);
   }

   public onTick(TickInfo info) {
   }

}
