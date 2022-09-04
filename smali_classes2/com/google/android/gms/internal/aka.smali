.class public Lcom/google/android/gms/internal/aka;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/drive/metadata/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/a",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/drive/metadata/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v2, 0x419ce0

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/f;

    const-string v1, "contentAvailability"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/aka;->a:Lcom/google/android/gms/drive/metadata/a;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/b;

    const-string v1, "isPinnable"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/aka;->b:Lcom/google/android/gms/drive/metadata/a;

    return-void
.end method
