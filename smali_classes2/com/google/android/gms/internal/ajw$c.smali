.class public Lcom/google/android/gms/internal/ajw$c;
.super Lcom/google/android/gms/drive/metadata/internal/p;

# interfaces
.implements Lcom/google/android/gms/drive/metadata/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ajw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/metadata/internal/p;",
        "Lcom/google/android/gms/drive/metadata/c",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const-string v0, "mimeType"

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/drive/metadata/internal/p;-><init>(Ljava/lang/String;I)V

    return-void
.end method
