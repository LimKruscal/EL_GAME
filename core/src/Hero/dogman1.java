package Hero;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.game.GameScreen;

import actor.BarGroup;
import stage.GameStage;

public class dogman1 extends Hero {
	//dog:     血500
    //力量 19
   //敏捷： 10
     //智力2
    //攻击： 20
         //护甲 1
	public dogman1(GameStage stage,boolean reverse){
	       super(stage,reverse);
	      money=50;
	      xp=400;
	      
	       maxBlood=500;
	       maxMagic=0;
	       blood=500;
	       magic=0;	       
	       force=19;
	       attack=20;
	       quick=10;
	       intelligence=2;
	       defence=(float)1;
	       bg=new BarGroup(0,1010,blood,magic,maxBlood,maxMagic,reverse);
	       if(!reverse)
		       image=new Image(new Texture("smallArmy/dogman.png"));
		       else
		    	   image=new Image(new Texture("smallArmy/dogman.png"));

			       if(!reverse)
			       image.setPosition(120,300);
			       else
			       image.setPosition(2208-image.getWidth()-120-1504-90,300);
			       image.scaleBy(1.0F);
			       this.addActor(hb);
			         
		            this.addActor(light);
		           this.addActor(sg);
            this.addActor(bg);
            this.addActor(image);
        
}
	@Override
	public boolean ability1() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ability2() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ability3() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ability4() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AI() {
		// TODO Auto-generated method stub
		return false;
	}
        
}
