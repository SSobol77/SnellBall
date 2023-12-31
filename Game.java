����   .� Game  com/nokia/mid/ui/FullCanvas  timer Ljava/util/Timer; sun LItem; cloudA cloudB cloudC bg  Ljavax/microedition/lcdui/Image; ball LBall; player LGamePlayer; mobile center I 
net_height wait pause Z end dic LDic; cntr counter lose_snd !Ljavax/microedition/media/Player; onTime ()V Code  	  #  	  %  	  ' 
GamePlayer ) points + 	 * ,  	  .  	  0  	  2 repaint 4 !
  5  	  7 Item 9 Move ()Z ; <
 : = 	 	  ? 
 	  A  	  C  	  E Ball G
 H = 	ClearHits J <
 H K hit M 	 * N 	Collision (LGamePlayer;)Z P Q
 H R
 * = Auto U !
  V Lose 	(LBall;)Z X Y
 * Z Set \ !
 * ] (I)V \ _
 H `  	  b javax/microedition/media/Player d start f ! e g 'javax/microedition/media/MediaException i LineNumberTable LocalVariableTable this LGame; rep pc mc paint &(Ljavax/microedition/lcdui/Graphics;)V  	  t java/util/Timer v cancel x !
 w y SnellballMIDlet { instance LSnellballMIDlet; } ~	 |   javax/microedition/lcdui/Display � 
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display; � �
 � � GameOver � <init> (II)V � �
 � � 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V � �
 � � !javax/microedition/lcdui/Graphics � setColor (III)V � �
 � � getWidth ()I � �
  � drawLine (IIII)V � �
 � � 	getHeight � �
  � javax/microedition/lcdui/Font � getFont $(III)Ljavax/microedition/lcdui/Font; � �
 � � setFont "(Ljavax/microedition/lcdui/Font;)V � �
 � �  	  � Dic � PAUSE S � �	 � � 	getString (I)Ljava/lang/String; � �
 � � 
drawString (Ljava/lang/String;III)V � �
 � �  	  � 	drawImage &(Ljavax/microedition/lcdui/Image;III)V � �
 � � r s
 : � � _
 � �  	  �  	  � javax/microedition/lcdui/Image �
 � � fillRect � �
 � � java/lang/StringBuffer � java/lang/String � valueOf � �
 � � (Ljava/lang/String;)V � �
 � � : � append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; � �
 � � (I)Ljava/lang/StringBuffer; � �
 � � toString ()Ljava/lang/String; � �
 � � � !
 � �
 * �
 H � x � 	 H �	 H � BRAVO � �	 � � BOO � �	 � � g #Ljavax/microedition/lcdui/Graphics; s Ljava/lang/String; i
  �
 � �  	  � /png/game.png � createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image; 
 � java/lang/System out Ljava/io/PrintStream;	 NO FILE: GAME .png
 java/io/PrintStream println �
 /png/sun.png
 � � (Ljava/lang/String;II)V �
 : 	(IIIIII)V \
 : /png/cloudA.png /png/cloudB.png /png/cloudC.png
 H � /png/right_! (IILjava/lang/String;I)V �#
 *$ 
/png/left_&
 w � Game$MyTimer) (LGame;LGame;)V �+
*,       d        schedule (Ljava/util/TimerTask;JJ)V23
 w4 java/lang/Object6 getClass ()Ljava/lang/Class;89
7: /wav/lose.wav< java/lang/Class> getResourceAsStream )(Ljava/lang/String;)Ljava/io/InputStream;@A
?B audio/x-wavD  javax/microedition/media/ManagerF createPlayer J(Ljava/io/InputStream;Ljava/lang/String;)Ljavax/microedition/media/Player;HI
GJ 
NO FILE: 1L 
NO FILE: 2N levelP 	 |Q	 *Q java/io/IOExceptionT Ljava/io/IOException; is Ljava/io/InputStream; ioe me )Ljavax/microedition/media/MediaException; 
keyPressed Menu]
^ � getGameAction (I)I`a
 b downLeftd !
 *e 	downRightg !
 *h downUpj !
 *k keyCode keyReleased upLefto !
 *p upRightr !
 *s	 * �	 * � rayw 	 Hx yz 	 H{	 *{	 *x 
SourceFile 	Game.java InnerClasses MyTimer StackMap !                 	     
                                                                              !  "  �    d*Y� $`� $<*� &� *Y� &d� &�*� (� -� *� /� -� *� 1*� 3� *� 6�*� 8� >W*� @� >W*� B� >W*� D� >W*� F� I<*� F� L� *� (� O*� /� O*� F*� (� S=*� F*� /� S>*� (� T<*� W*� /� T<� � *� F*� (� SW*� F*� /� SW*� (*� F� [� :*� (� ^*� /� ^*� /Y� -`� -*� F� a*(� &*� c� h � :*� /*� F� [� :*� (� ^*� /� ^*� (Y� -`� -*� F� a*(� &*� c� h � :*� 6�  jQ]] j  k   � *   ( 
 )  *  ,  -  0 6 1 ; 3 B 5 F 6 G 9 O : W ; _ < g ? o @ y B � C � G � H � J � K � L � N � P � Q � T � V � W � X � Y Z [ ^( `/ a6 bC cK dQ e_ hc i l   *   d m n   X o   � � p   � � q  �   v 
      6     ;     G     �     �        j    ]    j_      r s  "  <    �*� 1� .*� u� z*� u� �� �� �Y*� /� -*� (� -� �� ��*� 3� V+� �>� +*� �� ��*� ����+� �� �+ �� �+*� �� �� �*� �l*� �l� ��+*� �� �*� 8+� �*� @+� �*� B+� �*� D+� �+ �� �+*� �d*� �*� �� �*� �d� ϻ �Y*� /� -� ַ �۶ �*� (� -� � �M+� �� �+ � �� �+,*� �l*� �l� �+� �� �+ �� �� �Y� �*� /� O� � �M+,� �� �Y� �*� (� O� � �M+,*� �d� �*� (+� �*� /+� �*� F+� �*� &� b+� �� �+ �� �*� F� �*� F� � "+*� �� � �*� �l*� �l� �� +*� �� �� �*� �l*� �l� ��    k   � )   n  p  q  r 1 s 2 v 9 x @ y E z P y [ | f } o ~ �  � � � � � � � � � � � � � � � � � � � �' �2 �; �P �X �m �{ �� �� �� �� �� �� �� �� �� � l   *   � m n    � � �  � � � �  B  �  �   T  2   �   E   �    S   �    �   �  �   � �  �   � �    � !  "  �    '*� �*� &*� 3*� 1*� �Y� �� �*� $*� �*��� �� L�	�*� :Y*� ��*� �� ̷� 8*� 8,�*� :Y*� ��*� �� ̷� @*� @@�*� :Y*� ��*� �� ̷� B*� B �
d�*� :Y*� ��*� �� ̷� D*� D(P�*� HY*� ��*� �� ̷ � F*� *Y*� ��*� �� �"*� ��hl�%� (*� *Y*� ��*� �� �'*� ��l�%� /**� ��l� �**� �� �*� ��ld� �*� wY�(� u*� u�*Y**�-.0�5*� F� a*� 6*�;=�CL*+E�K� c� L�	M�� L�	O�� ��R�      >            +*� (�S*� /�S� &*� (�S*� /�S� *� (�S*� /�S�  ( 4 4U���U��� j  k   � &   �   	      ( � 4 � > � Z � i � � � � � � � � � � � � � �. �S �` �u �� �� �� �� �� �� �� �� �� �� �  � � � � � �& � l   4   ' m n   5 	 �V � WX � 	YV � 	Z[ �   k 	 4   U >    �   U�    j�  7  �  7    7    7  &  7   \ _  "  5     0� � �� ��^Y�_� ��*�c�      b         [   G   b   b   Q   b   b   0*� 3� *� 3� &*� 3� *� (�f� *� (�i� 
*� (�l�    k   :    �  �  �  � L � S � [ � ` � c � j � m � t � w � ~ � l        m n     m  �   H       L     [     c     m     w     ~     n _  "   �     6*�c�     0            0   0   )*� (�q� 
*� (�t�    k       � $ � + � . 5 l       6 m n     6m  �      $     .     5      U !  "  p     �*� F� �*� F� � g*� /�u*� /�vz(`� **� /�u*� /�vz(d� *� /�q*� /�t� �*� /�u*� /�vz� *� /�f� o*� /�i� e*� F� �*� /�u*� F�y`� *� /�i� 
*� /�f*� F�|*� /�}*� /�~d*� F�yd*� F�yd*� /�~d� 
*� /�l�    k   6     = D N a k u � � �! �" �$ l       � m n  �   8  N     k     u     �     �     �        ��   
 * �  