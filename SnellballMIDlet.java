����   . @ SnellballMIDlet   javax/microedition/midlet/MIDlet  instance LSnellballMIDlet; player_name Ljava/lang/String; level I position <init> ()V Code  
   	 
	   Dic  
MENU_START S  	    
	    	   LineNumberTable LocalVariableTable this startApp Logo !
 "   javax/microedition/lcdui/Display $ 
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display; & '
 % ( 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V * +
 % , 
Player     .  	  0 canvas !Ljavax/microedition/lcdui/Canvas; display "Ljavax/microedition/lcdui/Display; pauseApp 
destroyApp (Z)V notifyDestroyed 9 
  : unconditional Z 
SourceFile SnellballMIDlet.java !                 	 
     
           O     *� *� *� � *� �              	 	                         g     � "Y� #L*� )M,+� -*/� 1�                                   2 3    4 5   6      +      �                         7 8     =     *� ;�       
                      < =   >    ?