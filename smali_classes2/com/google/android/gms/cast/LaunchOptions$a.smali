.class public final Lcom/google/android/gms/cast/LaunchOptions$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/LaunchOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/cast/LaunchOptions;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/LaunchOptions;

    invoke-direct {v0}, Lcom/google/android/gms/cast/LaunchOptions;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$a;->a:Lcom/google/android/gms/cast/LaunchOptions;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Locale;)Lcom/google/android/gms/cast/LaunchOptions$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$a;->a:Lcom/google/android/gms/cast/LaunchOptions;

    invoke-static {p1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/LaunchOptions;->a(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/cast/LaunchOptions$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$a;->a:Lcom/google/android/gms/cast/LaunchOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/LaunchOptions;->a(Z)V

    return-object p0
.end method

.method public a()Lcom/google/android/gms/cast/LaunchOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$a;->a:Lcom/google/android/gms/cast/LaunchOptions;

    return-object v0
.end method
