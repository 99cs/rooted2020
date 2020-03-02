def downloadNmap() {
  new File("/tmp/nmap") << new URL ("https://raw.githubusercontent.com/andrew-d/static-binaries/master/binaries/linux/x86_64/nmap").getText()                
}

return this.&downloadNmap
