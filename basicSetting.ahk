;=============== Include =================
;#Include lib\IME.ahk

;F1��Esc
F1::
  Send, {Esc}
return

;���ϊ������p�p��
vk1Dsc07B::
  IME_SET(0)
return

;�ϊ������{�����
vk1Csc079::
  IME_SET(1)
return
