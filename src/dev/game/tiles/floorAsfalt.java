import dev.game.gfx.Assets;
import static dev.game.gfx.Assets.floor_asfalt;
import dev.game.tiles.Tile;


public class floorAsfalt extends Tile{
    
    public floorAsfalt(int id) {
        super(Assets.floor_asfalt, id);
    }
    
    @Override
   public boolean isSolid() {
        return true;
    }
    
}
