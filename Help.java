����   . � Help  com/nokia/mid/ui/FullCanvas  bg  Ljavax/microedition/lcdui/Image; position I dic LDic; score LScorePack; paint &(Ljavax/microedition/lcdui/Graphics;)V Code  	   !javax/microedition/lcdui/Graphics  	drawImage &(Ljavax/microedition/lcdui/Image;III)V  
   getFont !()Ljavax/microedition/lcdui/Font;  
   setColor (III)V  
   javax/microedition/lcdui/Font   $(III)Ljavax/microedition/lcdui/Font;  "
 ! # setFont "(Ljavax/microedition/lcdui/Font;)V % &
  ' Dic ) HELP_CONTROLS S + ,	 * - 	 
	  / 	getString (I)Ljava/lang/String; 1 2
 * 3 getWidth ()I 5 6
  7 	getHeight 9 6
  :
 ! : 
drawString (Ljava/lang/String;III)V = >
  ? HELP_EXIT_TO_MENU A ,	 * B LineNumberTable LocalVariableTable this LHelp; g #Ljavax/microedition/lcdui/Graphics; f Ljavax/microedition/lcdui/Font; i <init> ()V M N
  O 
MENU_START Q ,	 * R  	  T
 * O 	ScorePack W
 X O  	  Z /png/help.png \ javax/microedition/lcdui/Image ^ createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image; ` a
 _ b java/lang/System d out Ljava/io/PrintStream; f g	 e h NO FILE: menu.png j java/io/PrintStream l println (Ljava/lang/String;)V n o
 m p /png/logo.png r NO FILE: logo.png t repaint v N
  w java/io/IOException y x Ljava/io/IOException; xx 
keyPressed (I)V SnellballMIDlet � instance LSnellballMIDlet; � �	 � �  javax/microedition/lcdui/Display � 
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display; � �
 � � Menu �
 � O 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V � �
 � � keyCode 
SourceFile 	Help.java StackMap !                 	 
                �     b+*� � +� N+NVp� +� $� (� .6� 0+*� 0� 4*� 8
l*� ;l� .d-� <`h`� @�� C��α    D   "           $  ,  V  a  E   *    b F G     b H I   R J K  ) 8 L   �   $  ,     !   Y     !    M N     �     P*� P*� S� U*� *Y� V� 0*� XY� Y� [*]� c� � !L� ik� q*s� c� � M� iu� q*� x�  ! - - z 6 B B z  D   .        	  
 !  -  . ! 6 # B $ K ' O ( E        P F G   .  { |  C  } |  �   &  -    z B   z  z K      ~      I     � �� �� �Y� �� ��    D   
    ,  - E        F G      �    �    �