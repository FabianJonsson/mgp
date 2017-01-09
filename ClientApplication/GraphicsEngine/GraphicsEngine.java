import GameEngine.TickListener
import GameEngine.TickInfo

class GraphicsEngine implements TickListener {

   GraphicsEngine(GameEngine game) {
      game.addTickListener(this);
   }

   public onTick(TickInfo info) {
   }

}
