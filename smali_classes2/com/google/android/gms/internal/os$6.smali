.class Lcom/google/android/gms/internal/os$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ox;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/os;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/android/gms/internal/ox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ox",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/os;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/os;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/os$6;->a:Lcom/google/android/gms/internal/os;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ow;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ow;-><init>()V

    return-object v0
.end method
