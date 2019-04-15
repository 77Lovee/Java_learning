
class Man extends Creature{
	Man(){
	this.name = "Man";
	}
        public void SayHi(){
                System.out.println(" I am a "+this.name);
        }
}


class Women extends Creature{
	Women(){
        this.name = "Women";
	}

        public void SayHi(){
                System.out.println(" I am a "+this.name);
        }
}


class Robot extends Creature{
	Robot(){        
		super.name = "Robot";
	}
        public  void SayHi(){
                System.out.println(" I am a "+this.name);
        }
}

class Nvwa{
        Creature getProduct(String name){
		Creature tmp;
                if(name.equalsIgnoreCase("Man")){
			System.out.println("正在创建一个Man");
                        tmp = new Man();
                 }
                else if (name.equalsIgnoreCase("Women")){
			System.out.println("正在创建一个Women");
                       tmp =  new Women();
                }
                else if(name.equalsIgnoreCase("Robot")){
			System.out.println("正在创建一个Robot");
                       tmp = new  Robot();
                }
		else {
			tmp = null;
		}
		return tmp;
               
	}
}

public class Ques1 {
	public static void main(String[] args){
		Creature creature;
		Nvwa nvwa = new Nvwa();
		creature = nvwa.getProduct("Man");
		creature.SayHi();
		creature = nvwa.getProduct("Women");
		creature.SayHi();
		creature = nvwa.getProduct("Robot");
		creature.SayHi();
		}
}

