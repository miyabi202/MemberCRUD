package model;

public class porder {
		private Integer id;
		private String  username;
		private Integer ninicoffee; 
		private Integer latte;
		private Integer tea;
		private Integer milktea;
		private Integer bubbletea;
		private Integer juice;
		private Integer cake;
		private Integer pancake;
		private Integer icecream;
		private Integer hotdog;
		private Integer cornsoup;
		private Integer dumpling;
		private Integer coffeebean;
		private Integer teabagset;
		
		
		public porder(String username, Integer ninicoffee, Integer latte,
				Integer tea, Integer milktea, Integer bubbletea, Integer juice, Integer cake, Integer pancake,
				Integer icecream, Integer hotdog, Integer cornsoup, Integer dumpling, Integer coffeebean,
				Integer teabagset) {
			super();
		
			this.username = username;
			this.ninicoffee = ninicoffee;
			this.latte = latte;
			this.tea = tea;
			this.milktea = milktea;
			this.bubbletea = bubbletea;
			this.juice = juice;
			this.cake = cake;
			this.pancake = pancake;
			this.icecream = icecream;
			this.hotdog = hotdog;
			this.cornsoup = cornsoup;
			this.dumpling = dumpling;
			this.coffeebean = coffeebean;
			this.teabagset = teabagset;
		}


		public porder() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public Integer getNinicoffee() {
			return ninicoffee;
		}


		public void setNinicoffee(Integer ninicoffee) {
			this.ninicoffee = ninicoffee;
		}


		public Integer getLatte() {
			return latte;
		}


		public void setLatte(Integer latte) {
			this.latte = latte;
		}


		public Integer getTea() {
			return tea;
		}


		public void setTea(Integer tea) {
			this.tea = tea;
		}


		public Integer getMilktea() {
			return milktea;
		}


		public void setMilktea(Integer milktea) {
			this.milktea = milktea;
		}


		public Integer getBubbletea() {
			return bubbletea;
		}


		public void setBubbletea(Integer bubbletea) {
			this.bubbletea = bubbletea;
		}


		public Integer getJuice() {
			return juice;
		}


		public void setJuice(Integer juice) {
			this.juice = juice;
		}


		public Integer getCake() {
			return cake;
		}


		public void setCake(Integer cake) {
			this.cake = cake;
		}


		public Integer getPancake() {
			return pancake;
		}


		public void setPancake(Integer pancake) {
			this.pancake = pancake;
		}


		public Integer getIcecream() {
			return icecream;
		}


		public void setIcecream(Integer icecream) {
			this.icecream = icecream;
		}


		public Integer getHotdog() {
			return hotdog;
		}


		public void setHotdog(Integer hotdog) {
			this.hotdog = hotdog;
		}


		public Integer getCornsoup() {
			return cornsoup;
		}


		public void setCornsoup(Integer cornsoup) {
			this.cornsoup = cornsoup;
		}


		public Integer getDumpling() {
			return dumpling;
		}


		public void setDumpling(Integer dumpling) {
			this.dumpling = dumpling;
		}


		public Integer getCoffeebean() {
			return coffeebean;
		}


		public void setCoffeebean(Integer coffeebean) {
			this.coffeebean = coffeebean;
		}


		public Integer getTeabagset() {
			return teabagset;
		}


		public void setTeabagset(Integer teabagset) {
			this.teabagset = teabagset;
		}



	
		

}
