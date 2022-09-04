.class final Lcom/google/android/gms/games/internal/d$dl;
.super Lcom/google/android/gms/games/internal/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "dl"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/internal/n;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/n;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/b;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$dl;->a:Lcom/google/android/gms/games/internal/n;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$dl;->a:Lcom/google/android/gms/games/internal/n;

    invoke-virtual {v1}, Lcom/google/android/gms/games/internal/n;->d()Lcom/google/android/gms/games/internal/n$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;-><init>(Lcom/google/android/gms/games/internal/n$a;)V

    return-object v0
.end method
