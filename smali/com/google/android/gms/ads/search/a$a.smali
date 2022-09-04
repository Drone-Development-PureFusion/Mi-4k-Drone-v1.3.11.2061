.class public final Lcom/google/android/gms/ads/search/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/search/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/search/b$a;

.field private final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/search/b$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/search/b$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/search/a$a;)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_adPage"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/mediation/m;)Lcom/google/android/gms/ads/search/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/search/b$a;->a(Lcom/google/android/gms/ads/mediation/m;)Lcom/google/android/gms/ads/search/b$a;

    return-object p0
.end method

.method public a(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/b;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/a$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/search/b$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/b$a;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_channel"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v2, "csa_adtest"

    if-eqz p1, :cond_0

    const-string v0, "on"

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const-string v0, "off"

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/ads/search/a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    iget-object v2, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/search/b$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/b$a;

    new-instance v0, Lcom/google/android/gms/ads/search/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/search/a;-><init>(Lcom/google/android/gms/ads/search/a$a;Lcom/google/android/gms/ads/search/a$1;)V

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_number"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public b(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/customevent/a;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/a$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/search/b$a;->b(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/b$a;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_hl"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_clickToCall"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontSizeLocation"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorLocation"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public c(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_location"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_width"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontFamily"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_plusOnes"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public e(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/search/a$a;->d(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontFamilyAttribution"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public e(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_sellerRatings"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public f(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontSizeAnnotation"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorAdBorder"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public f(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_siteLinks"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public g(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontSizeAttribution"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorAdSeparator"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public g(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v2, "csa_noTitleUnderline"

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontSizeDescription"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorAnnotation"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public h(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_titleBold"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public i(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontSizeDomainLink"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorAttribution"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public i(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_detailedAttribution"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public j(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_fontSizeTitle"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorBackground"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public j(Z)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_longerHeadlines"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public k(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_adjustableLineHeight"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorBorder"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public l(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_attributionSpacingBelow"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public l(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorDomainLink"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public m(I)Lcom/google/android/gms/ads/search/a$a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_verticalSpacing"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorText"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_colorTitleLink"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_adBorderSelectors"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->b:Landroid/os/Bundle;

    const-string v1, "csa_borderSelections"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lcom/google/android/gms/ads/search/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a$a;->a:Lcom/google/android/gms/ads/search/b$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/search/b$a;->d(Ljava/lang/String;)Lcom/google/android/gms/ads/search/b$a;

    return-object p0
.end method
