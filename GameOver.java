����   . � GameOver  com/nokia/mid/ui/FullCanvas  bg  Ljavax/microedition/lcdui/Image; dic LDic; mobile I player pos code lastkey counter name [C score LScorePack; move_snd !Ljavax/microedition/media/Player; paint &(Ljavax/microedition/lcdui/Graphics;)V Code  	   !javax/microedition/lcdui/Graphics  	drawImage &(Ljavax/microedition/lcdui/Image;III)V  
   javax/microedition/lcdui/Font ! getFont $(III)Ljavax/microedition/lcdui/Font; # $
 " % setFont "(Ljavax/microedition/lcdui/Font;)V ' (
  ) 	 
	  +  
	  -  	  / javax/microedition/media/Player 1 start ()V 3 4 2 5 !()Ljavax/microedition/lcdui/Font; # 7
  8 O : stringWidth (Ljava/lang/String;)I < =
 " > setColor (III)V @ A
  B getWidth ()I D E
  F 	getHeight H E
  I
 " I fillRect (IIII)V L M
  N  
	  P drawRect R M
  S  	  U Dic W 	YOUR_NAME S Y Z	 X [ 	getString (I)Ljava/lang/String; ] ^
 X _ 
drawString (Ljava/lang/String;III)V a b
  c  	  e java/lang/String g valueOf (C)Ljava/lang/String; i j
 h k 'javax/microedition/media/MediaException m LineNumberTable LocalVariableTable this 
LGameOver; g #Ljavax/microedition/lcdui/Graphics; f Ljavax/microedition/lcdui/Font; tmp txt Ljava/lang/String; i <init> (II)V { 4
  }
 X }  
	  �  
	  �  
	  � 	ScorePack �
 � }  	  � java/lang/Object � getClass ()Ljava/lang/Class; � �
 � � /wav/boo.wav � java/lang/Class � getResourceAsStream )(Ljava/lang/String;)Ljava/io/InputStream; � �
 � � audio/x-wav �  javax/microedition/media/Manager � createPlayer J(Ljava/io/InputStream;Ljava/lang/String;)Ljavax/microedition/media/Player; � �
 � � java/lang/System � out Ljava/io/PrintStream; � �	 � � 
NO FILE: 1 � java/io/PrintStream � println (Ljava/lang/String;)V � �
 � � 
NO FILE: 2 � /png/gameover.png � javax/microedition/lcdui/Image � createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image; � �
 � � /png/victory.png � NO FILE: menu.png � /png/logo.png � NO FILE: logo.png � repaint � 4
  � java/io/IOException � m p is Ljava/io/InputStream; ioe Ljava/io/IOException; me )Ljavax/microedition/media/MediaException; x xx 
keyPressed (I)V SnellballMIDlet � instance LSnellballMIDlet; � �	 � �  javax/microedition/lcdui/Display � 
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display; � �
 � � Menu �
 � } 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V � �
 � � Save ([CIII)V � �
 � � keyCode 
SourceFile GameOver.java StackMap !                 	 
     
     
     
     
     
                         d    /+*� �  +� &� **� ,*� .� *� 0� 6 � :�+� 9M+� &� *,;� ?`>+ �� C6� ++*� Glhd`h`*� Jl,� K`,� K� O����+ � �� C+*� Glhd*� Q`h`d*� Jld,� K``,� K`� T+*� V� \� `*� Gl*� Jl� d+ � � �� C6� <*� f4� l:+*� Glhdl```h`*� Jl,� K`� d���ñ    , , n  o   V            .  /  4   > " G $ P % V ' { % � * � + � - � / � 0 � 2 � 3$ 0. 6 p   H   / q r    / s t  4 � u v  G � w 
  � - x y  S 2 z 
  � C z 
  �   q  ,     n .      /      V    "    ~    "    �    "   '    "     { |    ?     �*� ~*� XY� � V*� Q*A� �*A� �*� �*�� f*� �Y� �� �*� ,*� .*� ��� �N*-�� �� 0� N� ��� �� N� ��� �� *�� �� � .*�� �� � "N� ��� �*�� �� � :� ��� �>� *� f U����*� ñ  B Y Y � B Y e n n � � � � � � �  o   ^    8  
   %  -  8 : = ; B @ L A Y C e D n H s I  K � M � O � Q � R � U � V � U � W � X p   \ 	   � q r     � � 
    � � 
  L  � �  Z  � �  f  � �  �  � �  �  � �  �  z 
  �   � 	 Y    � e    n n   �      �   �   �  � �   �  � �   �   �     �      � �    �    w*� ,*� .� � ׸ ݻ �Y� � ��       ����   s����   s����   s����   �����   �   2   �   3   �   4   �   5   �   6   �   7   �   8     9  *� �*� f*� .*� ,� � ׸ ݻ �Y� � �*Y� Qd� Q*� Q� 	*� Q*� ñ*Y� Q`� Q*� Q� *� Q*� ñ*A� �� ?*D� �� 6*G� �� -*J� �� $*M� �� *P� �� *T� �� 	*W� �*� �� *Y� �`� �*� �� *� �� *� �*� �*� f*� Q*� �*� �`�U*� ñ    o   � )   \  ^  _  a � f � g � h � k � l � m � n � o � q � r � s � t � u � w � x � z � {  } ~	 � � � � �! �$ �* �- �3 �; �E �M �U �Z �_ �r �v � p      w q r    w � 
  �   �       �     �     �     �     �     �     �         	            $    -    3    U    _      �    �