.class Lcom/google/android/gms/nearby/messages/internal/s$e;
.super Lcom/google/android/gms/nearby/messages/internal/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/nearby/messages/j;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/nearby/messages/j;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/m$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/s$e;->a:Lcom/google/android/gms/nearby/messages/j;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/nearby/messages/j;)Lcom/google/android/gms/nearby/messages/internal/s$e;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/nearby/messages/internal/s$e;->b(Lcom/google/android/gms/nearby/messages/j;)Lcom/google/android/gms/nearby/messages/internal/s$e;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lcom/google/android/gms/nearby/messages/j;)Lcom/google/android/gms/nearby/messages/internal/s$e;
    .locals 1
    .param p0    # Lcom/google/android/gms/nearby/messages/j;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/s$e;

    invoke-direct {v0, p0}, Lcom/google/android/gms/nearby/messages/internal/s$e;-><init>(Lcom/google/android/gms/nearby/messages/j;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$e;->a:Lcom/google/android/gms/nearby/messages/j;

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/j;->a()V

    return-void
.end method
