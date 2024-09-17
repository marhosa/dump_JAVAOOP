section .data
    msg db 'watasigma', 0  ; Null-terminated string

section .text
    global _start

_start:
    ; Write 'watasigma' to stdout
    mov eax, 4          ; syscall number for sys_write
    mov ebx, 1          ; file descriptor 1 is stdout
    mov ecx, msg        ; pointer to the message
    mov edx, 9          ; length of the message
    int 0x80            ; call kernel

    ; Exit the program
    mov eax, 1          ; syscall number for sys_exit
    xor ebx, ebx        ; exit code 0
    int 0x80            ; call kernel
