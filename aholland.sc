# Soarer Converter's configuration for an IBM Model M122 (1390876) keyboard
# and an F122 (6110345) as well.
#
# Author: aHolland.
# Date: 13/6/18.
# Version: 1
#
##### BEGIN ######

remapblock

# Left-side function keys.
  EXTRA_F1      UNASSIGNED
  EXTRA_F2      ESC
  EXTRA_F3      UNASSIGNED
  EXTRA_F4      MEDIA_VOLUME_UP
  EXTRA_F5      PRINTSCREEN
  EXTRA_F6      MEDIA_VOLUME_DOWN
  EXTRA_F7      MEDIA_MUTE
  EXTRA_F8      MEDIA_PLAY_PAUSE
  EXTRA_F9      UNASSIGNED
  EXTRA_F10     LGUI

# Main alphanumeric block. This remapping is non-negotiable.
  EUROPE_1    BACKSLASH

  F13         	UNASSIGNED  
  F14           UNASSIGNED
  F15           UNASSIGNED
  F16           UNASSIGNED
  F17           UNASSIGNED
  F18           UNASSIGNED
  F19           UNASSIGNED
  F20           UNASSIGNED
  F21           UNASSIGNED
  F22           UNASSIGNED
  F23           UNASSIGNED
  F24           UNASSIGNED

# Navigation cluster; LANG_4 = "Rule"
  LANG_4        MEDIA_NEXT_TRACK

  # The numpad's gray keys are made to behave as normal in the default
  # layer (except what would be NumLock). The extra key becomes a comma.

  ESC           NUM_LOCK
  NUM_LOCK      PAD_SLASH
  SCROLL_LOCK   PAD_ASTERIX
  EXTRA_SYSRQ   PAD_MINUS
  PAD_ASTERIX   PAD_PLUS
  PAD_MINUS     PAD_PLUS      
  PAD_PLUS      PAD_ENTER

endblock

##### END ##########
