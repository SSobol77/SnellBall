����   . � Menu  com/nokia/mid/ui/FullCanvas  menu  Ljavax/microedition/lcdui/Image; dic LDic; tick !Ljavax/microedition/media/Player; enter paint &(Ljavax/microedition/lcdui/Graphics;)V Code  	   !javax/microedition/lcdui/Graphics  	drawImage &(Ljavax/microedition/lcdui/Image;III)V  
   getFont !()Ljavax/microedition/lcdui/Font;  
   SnellballMIDlet  instance LSnellballMIDlet;  	   position I ! "	  # javax/microedition/lcdui/Font % $(III)Ljavax/microedition/lcdui/Font;  '
 & ( setFont "(Ljavax/microedition/lcdui/Font;)V * +
  , setColor (III)V . /
  0 Dic 2 
MENU_LEVEL S 4 5	 3 6 java/lang/StringBuffer 8  	  : 	getString (I)Ljava/lang/String; < =
 3 > java/lang/String @ valueOf &(Ljava/lang/Object;)Ljava/lang/String; B C
 A D <init> (Ljava/lang/String;)V F G
 9 H EASY J 5	 3 K level M "	  N append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; P Q
 9 R toString ()Ljava/lang/String; T U
 9 V javax/microedition/lcdui/Image X getWidth ()I Z [
 Y \ 	getHeight ^ [
 Y _
 & _ 
drawString (Ljava/lang/String;III)V b c
  d 	MENU_EXIT f 5	 3 g LineNumberTable LocalVariableTable this LMenu; g #Ljavax/microedition/lcdui/Graphics; f Ljavax/microedition/lcdui/Font; i ()V F r
  s
 3 s /png/menu.png v createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image; x y
 Y z java/lang/System | out Ljava/io/PrintStream; ~ 	 } � NO FILE: menu.png � java/io/PrintStream � println � G
 � � java/lang/Object � getClass ()Ljava/lang/Class; � �
 � � /wav/menu.wav � java/lang/Class � getResourceAsStream )(Ljava/lang/String;)Ljava/io/InputStream; � �
 � � audio/x-wav �  javax/microedition/media/Manager � createPlayer J(Ljava/io/InputStream;Ljava/lang/String;)Ljavax/microedition/media/Player; � �
 � � 	 
	  � /wav/select.wav �  
	  � 
NO FILE: 1 � 
NO FILE: 2 � repaint � r
  � java/io/IOException � 'javax/microedition/media/MediaException � x Ljava/io/IOException; is Ljava/io/InputStream; ioe me )Ljavax/microedition/media/MediaException; 
keyPressed (I)V getGameAction (I)I � �
  � javax/microedition/media/Player � start � r � �  javax/microedition/lcdui/Display � 
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display; � �
 � � Game �
 � s 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V � �
 � � Scores �
 � s Help �
 � s Credits �
 � s 
destroyApp (Z)V � �
  � 
MENU_START � 5	 3 � keyCode 
SourceFile 	Menu.java StackMap !                 	 
     
          �     �+*� � +� M>� ��  � $� +� )� -+ � � �� 1� +� )� -+~ � Ӷ 1� 7� P+� 9Y*� ;� ?� E� I*� ;� L�  � O`� ?� S� W*� � ]
l*� � `l,� a`h`� e� ,+*� ;� ?*� � ]
l*� � `l,� a`h`� e�� h��B�    i   6             )  9  C  O   V ! � # �  � & j   *    � k l     � m n   � o p   � q "  �   b      &   9    &   O    &   �    &   �    &   �    &    F r    @     i*� t*� 3Y� u� ;*w� {� � L� ��� �*� ��� �L*+�� �� �*� ��� �L*+�� �� �� L� ��� �� L� ��� �*� ��     � $ O O � $ O [ �  i   2    (  
  +  , $ 1 . 2 8 3 B 4 O 6 [ 7 d 9 h : j   4    i k l     � �  . ! � �  P  � �  \  � �  �   ;      � $     O    � [    � d   �    � �    �    J*� ��    @          3   �  @  @  @  @    @   3*� �� � � M�  � $�   �          %   8   X   k   ~   ��  � ǻ �Y� ʶ Χ c�  Y� O`� O�  � O� M�  � O� C�  � ǻ �Y� Ѷ Χ 0�  � ǻ �Y� Զ Χ �  � ǻ �Y� ׶ Χ 
�  � ۧ b*� �� � � M�  Y� $d� $�  � $� ޢ =�  � h� $� 1*� �� � � M�  Y� $`� $�  � $� h� �  � ޵ $*� ��  8 D D � � � � �## �  i   r    > 8 B E C p F � G � I � J � K � L � N � O � Q � R � T � U � W � Z � \ � ] � ^ _ ` b$ c0 d< eE hI i j      J k l    J � "  �   �  8     D    � E     p     �     �     �     �     �     �     �     �    � �        #    �$    E      �    �