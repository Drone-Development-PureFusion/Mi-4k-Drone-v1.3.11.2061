.class final Lcom/google/android/gms/games/internal/d$q;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/video/f$c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/d$q;->a:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/video/f$c;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/d$q;->a:I

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/video/f$c;->a(I)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/video/f$c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$q;->a(Lcom/google/android/gms/games/video/f$c;)V

    return-void
.end method
