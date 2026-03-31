class Solution:
    def validate_ip_address(self, s: str) -> bool:
        if not s:
            return False

        chunks = s.split(".")

        if len(chunks) != 4:
            return False

        for chunk in chunks:
            if not chunk:
                return False

            if len(chunk) > 1 and chunk[0] == '0':
                return False

            if not chunk.isdigit():
                return False

            num = int(chunk)
            if not (0 <= num <= 255):
                return False

        return True