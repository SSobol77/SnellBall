����   . � Logo  com/nokia/mid/ui/FullCanvas  go Z logo  Ljavax/microedition/lcdui/Image; progress I dic LDic; timer Ljava/util/Timer; counter counter2 onTime ()V Code  
	    
	   /png/logo.png  javax/microedition/lcdui/Image  createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image;  
    	    java/lang/System " out Ljava/io/PrintStream; $ %	 # & NO FILE: logo.png ( java/io/PrintStream * println (Ljava/lang/String;)V , -
 + . repaint 0 
  1 java/io/IOException 3 LineNumberTable LocalVariableTable this LLogo; x Ljava/io/IOException; paint &(Ljavax/microedition/lcdui/Graphics;)V !javax/microedition/lcdui/Graphics = setColor (III)V ? @
 > A getWidth ()I C D
  E 	getHeight G D
  H fillRect (IIII)V J K
 > L 	drawImage &(Ljavax/microedition/lcdui/Image;III)V N O
 > P javax/microedition/lcdui/Font R getFont $(III)Ljavax/microedition/lcdui/Font; T U
 S V setFont "(Ljavax/microedition/lcdui/Font;)V X Y
 > Z  	  \ Dic ^ PRESENTS S ` a	 _ b 	getString (I)Ljava/lang/String; d e
 _ f
  H 
drawString (Ljava/lang/String;III)V i j
 > k ��� (I)V ? n
 > o g #Ljavax/microedition/lcdui/Graphics; <init> s 
  t  	  v 	 
	  x
 _ t /png/yes10style.png { NO FILE: yes10style.png } java/util/Timer 
 � t  	  � Logo$MyTimer � (LLogo;LLogo;)V s �
 � �       d schedule (Ljava/util/TimerTask;JJ)V � �
 � � 
keyPressed SnellballMIDlet � instance LSnellballMIDlet; � �	 � �  javax/microedition/lcdui/Display � 
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display; � �
 � � Menu �
 � t 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V � �
 � � keyCode 
SourceFile 	Logo.java InnerClasses MyTimer StackMap !                 	 
               
     
           �     K*Y� `� *Y� `� *�  �� 
* �� *�  � *� � !� L� ')� /*� 2�  1 = = 4  5   & 	      !  "   # ' $ 1 ' = ( F + J , 6       K 7 8   >  9 :  �      '     =    4 F      ; <         �*�  �� t+� B+*� F*� I� M+*� !*� Fl*� Il� Q+*� *� *� � B+� W� [+*� ]� c� g*� Fl*� Il*� !� hl`
`� l� +*� !� Q+m� p�    5   * 
   0 
 2  3  4 4 5 D 6 O 7 { ; � = � M 6       � 7 8     � q r  �     {   >   �   >    s      �     d*� u*� w*d� y*� _Y� z� ]*� *� *|� � !� L� '~� /*� 2*� w*� �Y� �� �*� �� �Y**� � � �� ��  $ 0 0 4  5   2    O   	 
     $ R 0 S 9 T = U B V M W c X 6       d 7 8   1  9 :  �     0    4 9      � n     k     *� w� �� �� �� �Y� �� ��    5       \  ]  `  a 6        7 8      � 
  �           �    � �   
  �  �  