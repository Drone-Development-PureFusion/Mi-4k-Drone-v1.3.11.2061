.class final Lcom/google/android/gms/games/internal/d$y;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/video/f$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "y"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Z

.field private final c:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$y;->a:Lcom/google/android/gms/common/api/Status;

    iput-boolean p2, p0, Lcom/google/android/gms/games/internal/d$y;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/games/internal/d$y;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$y;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
