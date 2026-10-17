public class Herolab {
    public static void main(String[] args) {
        String heroName = "CodeCrusader";
        int heroHealth = 100;
        int heroAttackPower = 25;
        
        System.out.println("=== " + heroName + " enters the dungeon! ===");
        
        // Step 1: Call printStatus method
        printStatus(heroName, heroHealth);
        pause(2000);
        System.out.println("\nA wild Fur slide appears!");
        
        // Step 2: Calculate and print attack damage
        int damageDealt = calculateDamage(heroAttackPower, 5);
        System.out.println(heroName + " strikes for " + damageDealt + " damage!");
        pause(2000);
        // Step 3: Test method overloading with potions
        System.out.println("\nHero takes damage in battle and needs healing...");
        heroHealth = 45; // Hero's health drops
        printStatus(heroName, heroHealth);
        pause(2000);
        // Test standard potion (+20 HP)
        heroHealth = drinkPotion(heroHealth);
        System.out.println("-> Drank a standard health potion.");
        printStatus(heroName, heroHealth);
        pause(2000);
        // Test custom magical elixir (+35 HP)
        heroHealth = drinkPotion(heroHealth, 35);
        System.out.println("-> Drank a magical elixir.");
        printStatus(heroName, heroHealth);
        pause(2000);
        // Extension Challenge: Check if alive
        System.out.println("\nIs the hero still alive? " + isAlive(heroHealth));
    }
    
   
    // Step 1: Void method that takes parameters and prints output
    public static void printStatus(String name, int health) {
        System.out.println("[Hero:" + name + "|HP:" + health + "]");
    }
    
    // Step 2: Value-returning method that computes and returns an int
   public static int calculateDamage(int baseAttack, int criticalBonus){
    int randomFlair = (int)(Math.random()*10);
    return baseAttack + criticalBonus + randomFlair;
   }
    
    // Step 3a: Overloaded potion method (Standard: +20 HP, capped at 100)
    public static int drinkPotion(int currentHealth){
        int newHealth = currentHealth + 20;
        return newHealth;
    }

    // Step 3b: Overloaded potion method (Custom boost amount)
    public static int drinkPotion(int currentHealth, int boostAmount){
        int newHealth = currentHealth + boostAmount;
        return newHealth;
    }
   
    // Extension: Boolean return method checking vitality
    public static boolean isAlive(int health){
        return health>0;
    }
    
    // Helper method to pause execution (like Python's time.sleep)
    public static void pause(int milliseconds) {
      try {
        Thread.sleep(milliseconds);
      } 
      catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }   
}