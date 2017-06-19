set nu
set tabstop=2
set autoindent
"set expandtab " auto cange tab to space
set shiftwidth=2
set nobackup
set noswapfile
set smartindent
set undodir=D:/tool/vim74-kaoriya-win64/undo
set nocompatible
set showtabline=2
filetype plugin on
autocmd FileType text setlocal textwidth=0

" all unicode treat double chalactor
set ambiwidth=double
" statusline setting
set laststatus=2
"set statusline=%F%m%r%h%w\%=[TYPE=%Y]\[FORMAT=%{&ff}]\[ENC=%{&fileencoding}]\[LOW=%l/%L]
set statusline=%F%m%r%h%w\%=[TYPE=%Y]\[ENC=%{&fileencoding}]\[LOW=%l/%L]

" ^ and $ keys remap
nnoremap <Space>h  ^
nnoremap <Space>l  $

" ignore risky keymap
nnoremap ZZ <Nop>
nnoremap ZQ <Nop>

" jk to esc
inoremap jk <Esc>

"set omnifunc
setlocal omnifunc=syntaxcomplete#Complete

"<C-Space> to omnifunc
inoremap <C-Space> <C-x><C-o>

" vimdiff color setting
hi DiffAdd    ctermfg=black ctermbg=2
hi DiffChange ctermfg=black ctermbg=3
hi DiffDelete ctermfg=black ctermbg=6
hi DiffText   ctermfg=black ctermbg=7

" view tab
"set list
"set listchars=tab:»-,trail:-,nbsp:%,eol:↲

"---------------------------
" Start Neobundle Settings.
"---------------------------
" bundleで管理するディレクトリを指定
set runtimepath+=~/.vim/bundle/neobundle.vim/

" Required:
call neobundle#begin(expand('~/.vim/bundle/'))

" neobundle自体をneobundleで管理
NeoBundleFetch 'Shougo/neobundle.vim'

" 追加のプラグイン

" NERDTree
NeoBundle 'scrooloose/nerdtree'

" gauche
NeoBundle 'aharisu/vim_goshrepl'
"NeoBundle 'aharisu/vim_gdev'

call neobundle#end()

" Required:
filetype plugin indent on

" 未インストールのプラグインがある場合、インストールするかどうかを尋ねてくれるようにする設定
NeoBundleCheck

"-------------------------
" End Neobundle Settings.
"-------------------------

