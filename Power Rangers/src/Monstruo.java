
/*
 * @author Amado G	
 */

public class  Monstruo 
	{
		private String Nombre = "";
		private String ElementoPrimario = "";
		private String Edad="";
		private String Color="";
		private String AbilidadEspecial = "";
		
		/*
		 * These methods do some beheavors of the monsters
		 */
		public String Grow()
		{
			return "Getting higher :v";
		}
		public String SlowMotion()
		{
			return"Slow Motion";
		}
		public String Golpear() 
		{
		   return "Hitting";	
		}
		
		public String SpecialAbility()
		{
			if(ElementoPrimario == "air")
			{
				AbilidadEspecial = "fly";
			}
			else if(ElementoPrimario == "fire")
			{
				AbilidadEspecial = "burn";
			}
			return AbilidadEspecial;
		}
		
		public void SetAtributos(String nombre, String elemento, String edad, String color)
		{
			this.Nombre = nombre;
			this.ElementoPrimario = elemento;
			this.Edad = edad;
			this.Color = color;
		}
		
		public String Show()
		{
			return "I'm " + Nombre +"I am  " + ElementoPrimario + "I'm " + Edad + "years old " + "and I'm  " + Color ;
		}
		
	    
	}