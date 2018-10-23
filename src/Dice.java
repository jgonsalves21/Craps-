
public class Dice {

		private int numRoll;
		
		public void Dice()
		{
			
			numRoll = 0;
			
		}
		
		public int roll()
		{
			numRoll ++;
			return (int)(Math.random()*6)+1;
			
		}
}
