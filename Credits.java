Êþº¾   . ¯ Credits  com/nokia/mid/ui/FullCanvas  timer Ljava/util/Timer; bg  Ljavax/microedition/lcdui/Image; dic LDic; author I onTime ()V Code repaint  
   LineNumberTable LocalVariableTable this 	LCredits; paint &(Ljavax/microedition/lcdui/Graphics;)V !javax/microedition/lcdui/Graphics  getFont !()Ljavax/microedition/lcdui/Font;  
   setColor (III)V   
  ! getWidth ()I # $
  % 	getHeight ' $
  ( fillRect (IIII)V * +
  , javax/microedition/lcdui/Font . $(III)Ljavax/microedition/lcdui/Font;  0
 / 1 setFont "(Ljavax/microedition/lcdui/Font;)V 3 4
  5 	 
	  7 Dic 9 
COPYRIGHTS S ; <	 : = 	getString (I)Ljava/lang/String; ? @
 : A 
drawString (Ljava/lang/String;III)V C D
  E
 / (  	  H 	drawImage &(Ljavax/microedition/lcdui/Image;III)V J K
  L javax/microedition/lcdui/Image N
 O ( 
YES10STYLE Q <	 : R ALL_RIGHTS_RES T <	 : U WWW_YES10STYLE W <	 : X  	  Z AUTHORS \ <	 : ] stringWidth (Ljava/lang/String;)I _ `
 / a g #Ljavax/microedition/lcdui/Graphics; f Ljavax/microedition/lcdui/Font; p <init> h 
  i
 : i /png/yes10style.png l createImage 4(Ljava/lang/String;)Ljavax/microedition/lcdui/Image; n o
 O p java/lang/System r out Ljava/io/PrintStream; t u	 s v NO FILE: yest10style.png x java/io/PrintStream z println (Ljava/lang/String;)V | }
 { ~ java/util/Timer 
  i  	   Credits$MyTimer  (LCredits;LCredits;)V h 
         d schedule (Ljava/util/TimerTask;JJ)V  
   java/io/IOException  x Ljava/io/IOException; 
keyPressed (I)V SnellballMIDlet  instance LSnellballMIDlet;  	    javax/microedition/lcdui/Display  
getDisplay F(Ljavax/microedition/midlet/MIDlet;)Ljavax/microedition/lcdui/Display;  
    Menu ¢
 £ i 
setCurrent )(Ljavax/microedition/lcdui/Displayable;)V ¥ ¦
  § keyCode 
SourceFile Credits.java InnerClasses MyTimer StackMap !                 	 
                3     *¶ ±       
                         )    a+¶ M>+¶ "+*¶ &*¶ )¶ -+¸ 2¶ 6+ ÿ ÿ ÿ¶ "+*´ 8² >¶ B*¶ &l¶ F,¶ G``>+*´ I*¶ &l¶ M*´ I¶ P`>+¸ 2¶ 6+ ÿ¶ "+*´ 8² S¶ B*¶ &l¶ F,¶ Gh`
`>+¸ 2¶ 6+ ÿ ÿ ÿ¶ "+*´ 8² V¶ B*¶ &l¶ F+ ÿ¶ ",¶ G``>+*´ 8² Y¶ B*¶ &l¶ F*Y´ [dµ [+¸ 2¶ 6*´ [ö,*´ 8² ^¶ B¶ bd¢ **¶ &
`µ [+   ¶ "+*´ 8² ^¶ B*´ [*¶ ),¶ Gdd¶ F±       n    %  '  )  *  - ( 0 5 1 L 2 U 3 f 5 p 7 z 8  9  ; ¦ = ± > ¾ @ Õ A Þ B ç C þ E F G* H5 JB K` L    *   a      a c d  \ e f  Y g   ®    5    /    h      ×     Z*· j*» :Y· kµ 8*µ [*m¸ qµ I§ L² wy¶ *» Y· µ *´ » Y**·   ¶ **¶ &
`µ [*¶ ±            * 
   N  
    Q   R ) S 4 T J U U V Y W        Z     !     ®           )            I     ² ¸ ¡» £Y· ¤¶ ¨±       
    [  \                ©    ª    « ¬   
    ­  