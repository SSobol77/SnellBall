����   . � 
GamePlayer  java/lang/Object  i_move ![Ljavax/microedition/lcdui/Image; i_jump move I level x y start_y start_x old_x old_y speed_x speed_y width height center 
net_height ray hit points gravity left Z right up 
hit_points [I paint &(Ljavax/microedition/lcdui/Graphics;)V Code  	  $  		  &  	  (  		  *  		  ,  		  . !javax/microedition/lcdui/Graphics 0 	drawImage &(Ljavax/microedition/lcdui/Image;III)V 2 3
 1 4  	  6  	  8  		  :  	  < LineNumberTable LocalVariableTable this LGamePlayer; g #Ljavax/microedition/lcdui/Graphics; Stop ()V  		  F Set D E
  I  		  K  		  M  		  O Lose 	(LBall;)Z  		  S Ball U	 V * ground X 	 V Y b LBall; Move ()Z  		  _ 
 		  a  		  c  		  e  		  g <init> (IILjava/lang/String;I)V i E
  k javax/microedition/lcdui/Image m  		  o   	  q java/lang/StringBuffer s java/lang/String u valueOf &(Ljava/lang/Object;)Ljava/lang/String; w x
 v y (Ljava/lang/String;)V i {
 t | m1.png ~ append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; � �
 t � toString ()Ljava/lang/String; � �
 t � createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image; � �
 n � m2.png � m3.png � j1.png � j2.png � j3.png � java/lang/System � out Ljava/io/PrintStream; � �	 � � NO FILE: player_.png � java/io/PrintStream � println � {
 � �  		  �  		  � getWidth ()I � �
 n � 	getHeight � �
 n � java/io/IOException � w h n Ljava/lang/String; s Ljava/io/IOException; tmp tmp2 downLeft 	downRight downUp upLeft upRight 
SourceFile GamePlayer.java StackMap !                  	    
 	     	     	     	     	     	     	     	     	     	     	     	     	     	     	     	     	                          ! "  #  �     �*� %� �*� '*� 'h � $+*� )2*� +*� -dz*� /*� -dz� 5*� '*� 'h0 � '+*� )2*� +*� -dz*� /*� -dz� 5� �+*� )2*� +*� -dz*� /*� -dz� 5� r*� 7� 
*� 9� >*Y� ;`� ;*Y� ;~� ;+*� =*� ;2*� +*� -dz*� /*� -dz� 5� )+*� =2*� +*� -dz*� /*� -dz� 5*� ;�    >   6         7  F  j  �  �   � ! � " � & � ' � 7 ?       � @ A     � B C  �   J  7   1   j   1   �   1   �   1   �   1   �   1    D E  #   O     *� G*� '*� 7*� 9�    >       ;  < 
 =  >  ? ?        @ A    H E  #   T     *� J**� L� +**� N� /*� P�    >       B  C  D  E  F ?        @ A    Q R  #   �     J*� P� �*� +*� T� +� W*� T� +� Z� �*� +*� T� +� W*� T� +� Z� ��    >   & 	   J  K 
 M   N ' O ) Q ? R F S H U ?       J @ A     J [ \  �   &  
   V   )   V   H   V    ] ^  #  [    V**� +� `*� 7� 9*� b� *Y� +d� +� $*� b� *Y� +d� +� *Y� +d� +*� 9� 9*� b� *Y� +`� +� $*� b� *Y� +`� +� *Y� +`� +*� %� A*Y� '*� dhd� '**� /� f*Y� /*� 'zd� /*� /*� N� *� %**� N� /*� +*� -d� **� -� +*� +*� -`*� h� **� h*� -d� +*� +*� T� &*� +*� -`*� T`� **� T*� -d`� +*� +*� T� &*� +*� -d*� Td� **� T*� -`d� +�    >   v    Z  [  ]  ^ $ _ , ` : b E d L f S g a h i i w k � m � o � p � q � s � u � v � { � | � } � ~ � � �& �D �T � ?      V @ A   �   e  $     :     E     a     w     �     �     �     �    &    T      i j  #  o    >*� l*� n� =*� n� )*� ;*� b*2� +*�� /*� G*� '*� P*� p*� d*� 7*� 9*� %*�
� r*� =� tY-� z� }� �� �� �S*� =� tY-� z� }�� �� �� �S*� =� tY-� z� }�� �� �� �S*� =� tY-� z� }�� �� �� �S*� )� tY-� z� }�� �� �� �S*� )� tY-� z� }�� �� �� �S*� )� tY-� z� }�� �� �� �S*� )� tY-� z� }�� �� �� �S� :� ��� �*h� h*h� �*hhhd� �**� =2� �hd� -**� �*� =2� �hd*� -`� N**� N� /*h� L**� L� +*� d**� hz� T*� =2� �h6*� =2� �h6*� r
hdldO*� rhdldO*� r-hdldO*� r7hdldO*� rFhdldO*� rZhdldO�  \?? �  >   � %   �      	  
 +  5  E  T  \ � x � � � � � � � � � �  �? �I �Q �Y �g �y �� �� �� �� �� �� �� �� �� �� �
 � �, �= � ?   R   > @ A    > � 	   > � 	   > � �   > � 	 A   � � t � 	 � g � 	  �   # ?   v  �I   v    � E  #   =     *� 7*� 9�    >       �  � 
 � ?        @ A    � E  #   =     *� 7*� 9�    >       �  � 
 � ?        @ A    � E  #   _     *� %� **� dh� '*� %�    >       �  �  �  � ?        @ A   �           � E  #   4     *� 7�    >   
    �  � ?        @ A    � E  #   4     *� 9�    >   
    �  � ?        @ A    �    �